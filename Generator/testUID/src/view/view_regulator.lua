local regulator = {}
local regulator_mt = { __index = regulator }

function regulator:new ()
	regulator.minValue = 0.0
	regulator.maxValue = 1.0
	regulator.value = 0.0
    regulator.defaultValue = 0.0

    regulator.notification_changed = "notify_changed"
	regulator.notification_doubleTap = "notify_doubleTap"
    return setmetatable( regulator, regulator_mt )
end
