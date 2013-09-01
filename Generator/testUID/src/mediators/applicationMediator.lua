ApplicationMediator = {}

function ApplicationMediator:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:addEventListener("showStageA", self)
			Runtime:addEventListener("showStageB", self)
			view:showView("stageA")
		end
		function mediator:onRemove()
			local view = self.viewInstance
			Runtime:removeEventListener("showStageA", self)
			Runtime:removeEventListener("showStageB", self)
		end
   		function mediator:showStageA(event)  
   			self.viewInstance:showView("stageA")
   		end
   		function mediator:showStageB(event)  
   			self.viewInstance:showView("stageB")
   		end
   	
  	return mediator
end

return ApplicationMediator
