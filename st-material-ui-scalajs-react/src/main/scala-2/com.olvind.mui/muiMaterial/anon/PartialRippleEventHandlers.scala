package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/useTouchRipple/useTouchRipple.RippleEventHandlers> */
@js.native
trait PartialRippleEventHandlers extends StObject {
  
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.native
  
  var onContextMenu: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onDragLeave: js.UndefOr[DragEventHandler[Element]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[Element]] = js.native
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[Element]] = js.native
  
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.native
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.native
  
  var onTouchMove: js.UndefOr[TouchEventHandler[Element]] = js.native
  
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.native
}
object PartialRippleEventHandlers {
  
  @scala.inline
  def apply(): PartialRippleEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRippleEventHandlers]
  }
  
  @scala.inline
  implicit class PartialRippleEventHandlersMutableBuilder[Self <: PartialRippleEventHandlers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBlur(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: ReactDragEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: ReactKeyboardEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: ReactKeyboardEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: ReactTouchEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: ReactTouchEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: ReactTouchEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => value(t0).runNow()))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
