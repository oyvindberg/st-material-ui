package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.EnableTouchRipple
import com.olvind.mui.muiMaterial.touchRippleMod.TouchRippleActions
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
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTouchRippleUseTouchRippleMod {
  
  @JSImport("@mui/material/useTouchRipple/useTouchRipple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: UseTouchRippleProps): EnableTouchRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[EnableTouchRipple]
  
  trait RippleEventHandlers extends StObject {
    
    var onBlur: FocusEventHandler[Element]
    
    var onContextMenu: MouseEventHandler[Element]
    
    var onDragLeave: DragEventHandler[Element]
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var onKeyUp: KeyboardEventHandler[Element]
    
    var onMouseDown: MouseEventHandler[Element]
    
    var onMouseLeave: MouseEventHandler[Element]
    
    var onMouseUp: MouseEventHandler[Element]
    
    var onTouchEnd: TouchEventHandler[Element]
    
    var onTouchMove: TouchEventHandler[Element]
    
    var onTouchStart: TouchEventHandler[Element]
  }
  object RippleEventHandlers {
    
    inline def apply(
      onBlur: ReactFocusEventFrom[Element & Element] => Callback,
      onContextMenu: ReactMouseEventFrom[Element & Element] => Callback,
      onDragLeave: ReactDragEventFrom[Element & Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[Element & Element] => Callback,
      onKeyUp: ReactKeyboardEventFrom[Element & Element] => Callback,
      onMouseDown: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseLeave: ReactMouseEventFrom[Element & Element] => Callback,
      onMouseUp: ReactMouseEventFrom[Element & Element] => Callback,
      onTouchEnd: ReactTouchEventFrom[Element & Element] => Callback,
      onTouchMove: ReactTouchEventFrom[Element & Element] => Callback,
      onTouchStart: ReactTouchEventFrom[Element & Element] => Callback
    ): RippleEventHandlers = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => onBlur(t0).runNow()), onContextMenu = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onContextMenu(t0).runNow()), onDragLeave = js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => onDragLeave(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => onKeyUp(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseDown(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseLeave(t0).runNow()), onMouseUp = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => onMouseUp(t0).runNow()), onTouchEnd = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchEnd(t0).runNow()), onTouchMove = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchMove(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => onTouchStart(t0).runNow()))
      __obj.asInstanceOf[RippleEventHandlers]
    }
    
    extension [Self <: RippleEventHandlers](x: Self) {
      
      inline def setOnBlur(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnDragLeave(value: ReactDragEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnKeyUp(value: ReactKeyboardEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchEnd(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchMove(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element & Element]) => value(t0).runNow()))
    }
  }
  
  trait UseTouchRippleProps extends StObject {
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableTouchRipple: js.UndefOr[Boolean] = js.undefined
    
    var disabled: Boolean
    
    var focusVisible: Boolean
    
    var rippleRef: RefHandle[TouchRippleActions]
  }
  object UseTouchRippleProps {
    
    inline def apply(disabled: Boolean, focusVisible: Boolean, rippleRef: RefHandle[TouchRippleActions]): UseTouchRippleProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], rippleRef = rippleRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseTouchRippleProps]
    }
    
    extension [Self <: UseTouchRippleProps](x: Self) {
      
      inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
      
      inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      inline def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
      
      inline def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setRippleRef(value: RefHandle[TouchRippleActions]): Self = StObject.set(x, "rippleRef", value.asInstanceOf[js.Any])
    }
  }
}
