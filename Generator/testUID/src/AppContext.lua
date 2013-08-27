require "robotlegs.Context"

AppContext = {}

function AppContext:new()
	local context = Context:new()

	function context:init()
		self:mapMediator("views.viewA", "mediators.viewAMediator")
		self:mapMediator("views.viewB", "mediators.viewBMediator")
		self:mapMediator("application", "mediators.applicationMediator")
		self:mapCommand("toState1Notification", "commands.state1Command")
		self:mapCommand("toState2Notification", "commands.state2Command")
		
		Runtime:dispatchEvent({name="startup"})
	end	

	return context
end

return AppContext
