viewB = {}

function viewB:new (parentGroup)
	local view = RNGroup:new()
  	view.classType = "viewB"

		function view:buttonstage1_touch(event)    
			Runtime:dispatchEvent({name="tostate1"})
		end
	

		function view:init()
			self.buttonstage1 = RNFactory.createButton ( 
				"button_off.png"
				, {
				imageOver = "button_over.png" ,
		  		imageDisabled = "button_disabled.png" ,
				onTouchDown = self.buttonstage1_touch,
				font = "arial.ttf",
				width = 200,
				height = 50,
				left = 0,
				top = 0
		 	})
			Runtime:dispatchEvent({name="onRobotlegsViewCreated", target=self})
		end

		function view:destroy()
			self.buttonstage1:remove()
			Runtime:dispatchEvent({name="onRobotlegsViewDestroyed", target=self})
			self:removeSelf()
		end

	view:init()
	return view
end
return viewB
