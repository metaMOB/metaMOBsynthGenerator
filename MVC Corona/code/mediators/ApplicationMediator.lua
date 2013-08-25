
CafeTownsendApplicationMediator = {}

function CafeTownsendApplicationMediator:new()
	local mediator = {}
 
	function mediator:onRegister()
		local view = self.viewInstance
		Runtime:addEventListener("showState1", self)
		Runtime:addEventListener("showState2", self)
		view:showView("viewA")
	end

	function mediator:showState1()
		self.viewInstance:showView("viewA")
	end

	function mediator:showState2(event)
   		self.viewInstance:showView("viewB")
	end
	return mediator
end

return CafeTownsendApplicationMediator