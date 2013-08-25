ViewBMediator = {}

function ViewBMediator:new()
	local mediator = {}

	function mediator:onRegister()
		local view = self.viewInstance
    print ("+++++++++++++++++++++++++++++++++++++++")
		Runtime:addEventListener("toState1", self)
	end

	function mediator:onRemove()
		local view = self.viewInstance
		Runtime:removeEventListener("toState1", self)
	end

	function mediator:toState1(event)
    print ("+++++++++++++++++++++++++++++++++++++++")
		Runtime:dispatchEvent({name="toState1Notification"})
	end
  
	return mediator
end

return ViewBMediator