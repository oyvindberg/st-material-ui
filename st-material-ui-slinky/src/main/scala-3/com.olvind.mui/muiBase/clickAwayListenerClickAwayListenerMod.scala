package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerClickAwayListenerMod {
  
  @js.native
  trait ClickAwayListenerProps extends StObject {
    
    /**
      * The wrapped element.
      */
    var children: ReactElement = js.native
    
    /**
      * If `true`, the React tree is ignored and only the DOM tree is considered.
      * This prop changes how portaled elements are handled.
      * @default false
      */
    var disableReactTree: js.UndefOr[Boolean] = js.native
    
    /**
      * The mouse event to listen to. You can disable the listener by providing `false`.
      * @default 'onClick'
      */
    var mouseEvent: js.UndefOr[ClickAwayMouseEventHandler | `false`] = js.native
    
    /**
      * Callback fired when a "click away" event is detected.
      */
    def onClickAway(event: MouseEvent): Unit = js.native
    def onClickAway(event: TouchEvent): Unit = js.native
    
    /**
      * The touch event to listen to. You can disable the listener by providing `false`.
      * @default 'onTouchEnd'
      */
    var touchEvent: js.UndefOr[ClickAwayTouchEventHandler | `false`] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.onClick
    - `com.olvind.mui`.muiBase.muiBaseStrings.onMouseDown
    - `com.olvind.mui`.muiBase.muiBaseStrings.onMouseUp
  */
  trait ClickAwayMouseEventHandler extends StObject
  object ClickAwayMouseEventHandler {
    
    inline def onClick: com.olvind.mui.muiBase.muiBaseStrings.onClick = "onClick".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.onClick]
    
    inline def onMouseDown: com.olvind.mui.muiBase.muiBaseStrings.onMouseDown = "onMouseDown".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.onMouseDown]
    
    inline def onMouseUp: com.olvind.mui.muiBase.muiBaseStrings.onMouseUp = "onMouseUp".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.onMouseUp]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.onTouchStart
    - `com.olvind.mui`.muiBase.muiBaseStrings.onTouchEnd
  */
  trait ClickAwayTouchEventHandler extends StObject
  object ClickAwayTouchEventHandler {
    
    inline def onTouchEnd: com.olvind.mui.muiBase.muiBaseStrings.onTouchEnd = "onTouchEnd".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.onTouchEnd]
    
    inline def onTouchStart: com.olvind.mui.muiBase.muiBaseStrings.onTouchStart = "onTouchStart".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.onTouchStart]
  }
}
