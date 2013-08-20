local state = {}
local state_mt = { __index = state }

function MainView:new ()
	state.backgroundImage = stateBackground.png
	return setmetatable( state, state_mt )
end
