ViewAMediator = {}

function ViewAMediator:new()
	local mediator = {}

	function mediator:onRegister()
		local view = self.viewInstance
		view:addEventListener("toState2", self)
	end

	function mediator:onRemove()
		local view = self.viewInstance
		view:removeEventListener("toState2", self)
	end

	function mediator:toState2(event)    
		Runtime:dispatchEvent({name="toState2Notification"})
	end
  
	return mediator
end

return ViewAMediator