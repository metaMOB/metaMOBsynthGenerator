applicationMediator = {}

function applicationMediator:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:addEventListener("showState1", self)
			Runtime:addEventListener("showState2", self)
			view:showView("viewA")
		end
		function mediator:onRemove()
			local view = self.viewInstance
			Runtime:removeEventListener("showState1", self)
			Runtime:removeEventListener("showState2", self)
		end
   		function mediator:showState1(event)  
   			self.viewInstance:showView("viewA")
   		end
   		function mediator:showState2(event)  
   			self.viewInstance:showView("viewB")
   		end
   	
  	return mediator
end

return applicationMediator
