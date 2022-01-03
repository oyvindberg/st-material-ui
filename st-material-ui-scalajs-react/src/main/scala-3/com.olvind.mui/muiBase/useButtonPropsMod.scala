package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Root
import com.olvind.mui.muiBase.muiBaseStrings.button
import com.olvind.mui.muiBase.muiBaseStrings.reset
import com.olvind.mui.muiBase.muiBaseStrings.submit
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.std.NonNullable
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useButtonPropsMod {
  
  trait UseButtonProps extends StObject {
    
    /**
      * The component used for the Root slot.
      * Either a string to use a HTML element or a component.
      * This is equivalent to `components.Root`. If both are provided, the `component` is used.
      * @default 'button'
      */
    var component: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The components used for each slot inside the Button.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var components: js.UndefOr[Root] = js.undefined
    
    /**
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onFocusVisible: js.UndefOr[FocusEventHandler[Element]] = js.undefined
    
    var ref: Ref[Any]
    
    var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    /**
      * Type attribute applied when the `component` is `button`.
      * @default 'button'
      */
    var `type`: js.UndefOr[submit | reset | button] = js.undefined
  }
  object UseButtonProps {
    
    inline def apply(): UseButtonProps = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[UseButtonProps]
    }
    
    extension [Self <: UseButtonProps](x: Self) {
      
      inline def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setComponents(value: Root): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocusVisible(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
