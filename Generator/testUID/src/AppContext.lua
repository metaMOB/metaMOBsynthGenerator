require "robotlegs.Context"

AppContext = {}

function AppContext:new()
	local context = Context:new()

	function context:init()
		self:mapMediator("views.StageA", "mediators.MediatorA")
		self:mapMediator("views.StageB", "mediators.MediatorB")
		self:mapMediator("SeTestApp", "mediators.ApplicationMediator")
		self:mapCommand("commandTouchButtonA", "commands.CMDStageA")
		self:mapCommand("commandTouchButtonB", "commands.CMDStageB")
		
		Runtime:dispatchEvent({name="startup"})
	end	

	return context
end

return AppContext
