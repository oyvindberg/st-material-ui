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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTouchRippleUseTouchRippleMod {
  
  @JSImport("@mui/material/useTouchRipple/useTouchRipple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: UseTouchRippleProps): EnableTouchRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[EnableTouchRipple]
  
  @js.native
  trait RippleEventHandlers extends StObject {
    
    var onBlur: FocusEventHandler[Element] = js.native
    
    var onContextMenu: MouseEventHandler[Element] = js.native
    
    var onDragLeave: DragEventHandler[Element] = js.native
    
    var onKeyDown: KeyboardEventHandler[Element] = js.native
    
    var onKeyUp: KeyboardEventHandler[Element] = js.native
    
    var onMouseDown: MouseEventHandler[Element] = js.native
    
    var onMouseLeave: MouseEventHandler[Element] = js.native
    
    var onMouseUp: MouseEventHandler[Element] = js.native
    
    var onTouchEnd: TouchEventHandler[Element] = js.native
    
    var onTouchMove: TouchEventHandler[Element] = js.native
    
    var onTouchStart: TouchEventHandler[Element] = js.native
  }
  object RippleEventHandlers {
    
    @scala.inline
    def apply(
      onBlur: ReactFocusEventFrom[Element with Element] => Callback,
      onContextMenu: ReactMouseEventFrom[Element with Element] => Callback,
      onDragLeave: ReactDragEventFrom[Element with Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[Element with Element] => Callback,
      onKeyUp: ReactKeyboardEventFrom[Element with Element] => Callback,
      onMouseDown: ReactMouseEventFrom[Element with Element] => Callback,
      onMouseLeave: ReactMouseEventFrom[Element with Element] => Callback,
      onMouseUp: ReactMouseEventFrom[Element with Element] => Callback,
      onTouchEnd: ReactTouchEventFrom[Element with Element] => Callback,
      onTouchMove: ReactTouchEventFrom[Element with Element] => Callback,
      onTouchStart: ReactTouchEventFrom[Element with Element] => Callback
    ): RippleEventHandlers = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => onBlur(t0).runNow()), onContextMenu = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => onContextMenu(t0).runNow()), onDragLeave = js.Any.fromFunction1((t0: ReactDragEventFrom[Element with Element]) => onDragLeave(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element with Element]) => onKeyDown(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element with Element]) => onKeyUp(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => onMouseDown(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => onMouseLeave(t0).runNow()), onMouseUp = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => onMouseUp(t0).runNow()), onTouchEnd = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => onTouchEnd(t0).runNow()), onTouchMove = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => onTouchMove(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => onTouchStart(t0).runNow()))
      __obj.asInstanceOf[RippleEventHandlers]
    }
    
    @scala.inline
    implicit class RippleEventHandlersMutableBuilder[Self <: RippleEventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnContextMenu(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragLeave(value: ReactDragEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnKeyDown(value: ReactKeyboardEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnKeyUp(value: ReactKeyboardEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseDown(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseLeave(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseUp(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchEnd(value: ReactTouchEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchMove(value: ReactTouchEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchStart(value: ReactTouchEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[Element with Element]) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait UseTouchRippleProps extends StObject {
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.native
    
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    var disableTouchRipple: js.UndefOr[Boolean] = js.native
    
    var disabled: Boolean = js.native
    
    var focusVisible: Boolean = js.native
    
    var rippleRef: RefHandle[TouchRippleActions] = js.native
  }
  object UseTouchRippleProps {
    
    @scala.inline
    def apply(disabled: Boolean, focusVisible: Boolean, rippleRef: RefHandle[TouchRippleActions]): UseTouchRippleProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], rippleRef = rippleRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseTouchRippleProps]
    }
    
    @scala.inline
    implicit class UseTouchRipplePropsMutableBuilder[Self <: UseTouchRippleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleRef(value: RefHandle[TouchRippleActions]): Self = StObject.set(x, "rippleRef", value.asInstanceOf[js.Any])
    }
  }
}
