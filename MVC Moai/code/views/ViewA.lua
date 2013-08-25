ViewA = {}

function ViewA:new(parentGroup)
  print ("New ViewA")
	local view = RNGroup:new()
  view.classType = "ViewA"
--	view.classType = "ViewA"
--	view.FONT_NAME = "HelveticaNeue-Bold"
--	view.FONT = native.newFont(view.FONT_NAME)

--	if parentGroup then
--		parentGroup:insert(view)
--	end

  function view:touch(event)    
		Runtime:dispatchEvent({name="toState2"})
    --self:dispatchEvent({name="onLogin"})
	end
	
  function view:init()
    self.button = RNFactory.createButton ( "assets/images/push-button-center.png", {
      text = "View 2",
      imageOver = "assets/images/push-button-delete-center.png",
      imageDisabled = "assets/images/push-button-delete-center.png",
      top = 50,
      left = 50,
      size = 200,
      width = 50,
      height = 1,
      onTouchDown = self.touch,
      font = "arial.ttf"
    } )
  
    print ("t-------------- ")
    Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
	end

	

	function view:destroy()
    self.button:remove()
		Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
		self:removeSelf()
	end

	view:init()

	return view
end

return ViewA