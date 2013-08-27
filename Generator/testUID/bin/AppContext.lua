require "robotlegs.Context"

AppContext = {}

function AppContext:new()
	local context = Context:new()

	function context:init()
				

				


		self:mapCommand("showState1", "commands.state1Command")
		self:mapCommand("showState2", "commands.state2Command")
		Runtime:dispatchEvent({name="startup"})
	end	

	return context
end

return AppContext
