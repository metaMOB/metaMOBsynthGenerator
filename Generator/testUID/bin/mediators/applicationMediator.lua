applicationMediator = {}

function applicationMediator:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:addEventListener("showState1", self)
			Runtime:addEventListener("showState2", self)
		end
		function mediator:onRemove()
			local view = self.viewInstance
			Runtime:removeEventListener("showState1", self)
			Runtime:removeEventListener("showState2", self)
		end
   			function mediator:showState1(event)  
   		end
   			function mediator:showState2(event)  
   		end
   	
  	return mediator
end

return applicationMediator
