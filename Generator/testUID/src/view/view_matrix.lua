local matrix = {}
local matrix_mt = { __index = matrix }

function matrix:new ()
	matrix.image_background = "backgroundImage.png"
	matrix.image_tap = "tapImage.png"
	matrix.image_doubleTap = "doubleTapImage.png"

    matrix.notification_tap = "notify_tap"
	matrix.notification_doubleTap = "notify_doubleTap"
    matrix.notification_moveSingleTouch = "notify_moveSingleTouch"
	matrix.notification_moveMultiTouch = "notify_moveMultiTouch"
    return setmetatable( matrix, matrix_mt )
end
