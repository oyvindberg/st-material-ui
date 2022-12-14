package com.olvind.mui.muiBase

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerClickAwayListenerMod {
  
  @js.native
  trait ClickAwayListenerProps extends StObject {
    
    /**
      * The wrapped element.
      */
    var children: Element = js.native
    
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
    var mouseEvent: js.UndefOr[ClickAwayMouseEventHandler | false] = js.native
    
    /**
      * Callback fired when a "click away" event is detected.
      */
    def onClickAway(event: MouseEvent): Unit = js.native
    def onClickAway(event: TouchEvent): Unit = js.native
    
    /**
      * The touch event to listen to. You can disable the listener by providing `false`.
      * @default 'onTouchEnd'
      */
    var touchEvent: js.UndefOr[ClickAwayTouchEventHandler | false] = js.native
  }
  
  object ClickAwayMouseEventHandler {
    
    inline def onClick: "onClick" = "onClick".asInstanceOf["onClick"]
    
    inline def onMouseDown: "onMouseDown" = "onMouseDown".asInstanceOf["onMouseDown"]
    
    inline def onMouseUp: "onMouseUp" = "onMouseUp".asInstanceOf["onMouseUp"]
    
    inline def onPointerDown: "onPointerDown" = "onPointerDown".asInstanceOf["onPointerDown"]
    
    inline def onPointerUp: "onPointerUp" = "onPointerUp".asInstanceOf["onPointerUp"]
  }
  type ClickAwayMouseEventHandler = "onClick" | "onMouseDown" | "onMouseUp" | "onPointerDown" | "onPointerUp"
  
  object ClickAwayTouchEventHandler {
    
    inline def onTouchEnd: "onTouchEnd" = "onTouchEnd".asInstanceOf["onTouchEnd"]
    
    inline def onTouchStart: "onTouchStart" = "onTouchStart".asInstanceOf["onTouchStart"]
  }
  type ClickAwayTouchEventHandler = "onTouchStart" | "onTouchEnd"
}
