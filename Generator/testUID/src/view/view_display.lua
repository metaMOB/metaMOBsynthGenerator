local display = {}
local display_mt = { __index = display }

function display:new ()
	display.image_background = "backgroundImage.png"
	display.value = 0.0

    return setmetatable( display, display_mt )
end
