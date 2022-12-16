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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/useTouchRipple/useTouchRipple.RippleEventHandlers> */
trait PartialRippleEventHandlers extends StObject {
  
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  var onContextMenu: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onDragLeave: js.UndefOr[DragEventHandler[Element]] = js.undefined
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[Element]] = js.undefined
  
  var onKeyUp: js.UndefOr[KeyboardEventHandler[Element]] = js.undefined
  
  var onMouseDown: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onMouseUp: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  
  var onTouchEnd: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  
  var onTouchMove: js.UndefOr[TouchEventHandler[Element]] = js.undefined
  
  var onTouchStart: js.UndefOr[TouchEventHandler[Element]] = js.undefined
}
object PartialRippleEventHandlers {
  
  inline def apply(): PartialRippleEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRippleEventHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRippleEventHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnBlur(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnContextMenu(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDragLeave(value: ReactDragEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnMouseDown(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseUp(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnTouchEnd(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
