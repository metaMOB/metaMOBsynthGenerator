viewBMediator = {}

function viewBMediator:new ()
	local mediator = {}

		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:addEventListener("toState1", self)
		end
		function mediator:onRegister()
			local view = self.viewInstance
			Runtime:removeEventListener("toState1", self)
		end
   			function mediator:toState1(event)  
   			Runtime:dispatchEvent({name="toState1Notification"}) 
   		end
   	
  
	return mediator
end

return viewBMediator
