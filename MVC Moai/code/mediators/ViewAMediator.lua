ViewAMediator = {}

function ViewAMediator:new()
	local mediator = {}

	function mediator:onRegister()
    print ("------------------soso###########")
		local view = self.viewInstance
		Runtime:addEventListener("toState2", self)
	end

	function mediator:onRemove()
		local view = self.viewInstance
		Runtime:removeEventListener("toState2", self)
	end

	function mediator:toState2(event)    
    print ("klar")
		Runtime:dispatchEvent({name="toState2Notification"})
	end
  
	return mediator
end

return ViewAMediator