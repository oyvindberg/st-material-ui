package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.EnableTouchRipple
import com.olvind.mui.muiMaterial.touchRippleMod.TouchRippleActions
import com.olvind.mui.react.mod.DragEvent
import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.TouchEventHandler
import org.scalajs.dom.Element
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
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
      onBlur: SyntheticFocusEvent[Element] => Unit,
      onContextMenu: SyntheticMouseEvent[Element] => Unit,
      onDragLeave: DragEvent[Element] => Unit,
      onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
      onKeyUp: SyntheticKeyboardEvent[Element] => Unit,
      onMouseDown: SyntheticMouseEvent[Element] => Unit,
      onMouseLeave: SyntheticMouseEvent[Element] => Unit,
      onMouseUp: SyntheticMouseEvent[Element] => Unit,
      onTouchEnd: SyntheticTouchEvent[Element] => Unit,
      onTouchMove: SyntheticTouchEvent[Element] => Unit,
      onTouchStart: SyntheticTouchEvent[Element] => Unit
    ): RippleEventHandlers = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onContextMenu = js.Any.fromFunction1(onContextMenu), onDragLeave = js.Any.fromFunction1(onDragLeave), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchMove = js.Any.fromFunction1(onTouchMove), onTouchStart = js.Any.fromFunction1(onTouchStart))
      __obj.asInstanceOf[RippleEventHandlers]
    }
    
    @scala.inline
    implicit class RippleEventHandlersMutableBuilder[Self <: RippleEventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[Element] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UseTouchRippleProps extends StObject {
    
    var disableFocusRipple: js.UndefOr[Boolean] = js.native
    
    var disableRipple: js.UndefOr[Boolean] = js.native
    
    var disableTouchRipple: js.UndefOr[Boolean] = js.native
    
    var disabled: Boolean = js.native
    
    var focusVisible: Boolean = js.native
    
    var rippleRef: ReactRef[TouchRippleActions] = js.native
  }
  object UseTouchRippleProps {
    
    @scala.inline
    def apply(disabled: Boolean, focusVisible: Boolean, rippleRef: ReactRef[TouchRippleActions]): UseTouchRippleProps = {
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
      def setRippleRef(value: ReactRef[TouchRippleActions]): Self = StObject.set(x, "rippleRef", value.asInstanceOf[js.Any])
    }
  }
}
