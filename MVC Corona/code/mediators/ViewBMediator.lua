ViewBMediator = {}

function ViewBMediator:new()
	local mediator = {}

	function mediator:onRegister()
		local view = self.viewInstance
		view:addEventListener("toState1", self)
	end

	function mediator:onRemove()
		local view = self.viewInstance
		view:removeEventListener("toState1", self)
	end

	function mediator:toState1(event)
		Runtime:dispatchEvent({name="toState1Notification"})
	end
  
	return mediator
end

return ViewBMediator