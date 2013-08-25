require "robotlegs.Context"

AppContext = {}

function AppContext:new()
	local context = Context:new()

	function context:init()
		self:mapMediator("views.ViewA",
							"mediators.ViewAMediator")

		self:mapMediator("views.ViewB",
							"mediators.ViewBMediator")
            
    self:mapMediator("Application",
							"mediators.ApplicationMediator")

		self:mapCommand("toState2Notification", "commands.State2Command")

		self:mapCommand("toState1Notification", "commands.State1Command")

		Runtime:dispatchEvent({name="startup"})
	end	

	return context
end

return AppContext