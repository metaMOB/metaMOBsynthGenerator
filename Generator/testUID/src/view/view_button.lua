local button = {}
local button_mt = { __index = button }

function button:new ()
	button.image_on = "buttonOn.png"
	button.image_off = "buttonOff.png"
	button.image_disabled = "buttonDisabled.png"
    button.notification_pressed = "notify_buttonPressed"
    button.notification_released = "notify_buttonReleased"
    return setmetatable( button, button_mt )
end
