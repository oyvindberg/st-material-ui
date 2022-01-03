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
    def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnContextMenu(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
    
    @scala.inline
    def setOnDragLeave(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
