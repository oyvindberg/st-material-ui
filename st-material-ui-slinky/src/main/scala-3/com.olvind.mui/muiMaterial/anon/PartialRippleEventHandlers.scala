package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.react.mod.DragEvent
import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import org.scalajs.dom.Element
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
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
    
    inline def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnContextMenu(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    inline def setOnDragLeave(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    inline def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    inline def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseUp(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnTouchEnd(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
