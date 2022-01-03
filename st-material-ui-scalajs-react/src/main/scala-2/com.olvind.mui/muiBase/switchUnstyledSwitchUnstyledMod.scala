package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.Thumb
import com.olvind.mui.muiBase.anon.Track
import com.olvind.mui.muiBase.useSwitchMod.UseSwitchProps
import com.olvind.mui.react.mod.ForwardRefExoticComponent
import com.olvind.mui.react.mod.RefAttributes
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchUnstyledSwitchUnstyledMod extends Shortcut {
  
  /**
    * The foundation for building custom-styled switches.
    *
    * Demos:
    *
    * - [Switches](https://mui.com/components/switches/)
    *
    * API:
    *
    * - [SwitchUnstyled API](https://mui.com/api/switch-unstyled/)
    */
  @JSImport("@mui/base/SwitchUnstyled/SwitchUnstyled", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SwitchUnstyledProps with RefAttributes[Any]] = js.native
  
  @js.native
  trait SwitchUnstyledComponentsPropsOverrides extends StObject
  
  @js.native
  trait SwitchUnstyledProps
    extends StObject
       with UseSwitchProps {
    
    /**
      * Class name applied to the root element.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * The component used for the Root slot.
      * Either a string to use a HTML element or a component.
      * This is equivalent to `components.Root`. If both are provided, the `component` is used.
      */
    var component: js.UndefOr[ElementType] = js.native
    
    /**
      * The components used for each slot inside the Switch.
      * Either a string to use a HTML element or a component.
      * @default {}
      */
    var components: js.UndefOr[Thumb] = js.native
    
    /**
      * The props used for each slot inside the Switch.
      * @default {}
      */
    var componentsProps: js.UndefOr[Track] = js.native
  }
  object SwitchUnstyledProps {
    
    @scala.inline
    def apply(): SwitchUnstyledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchUnstyledProps]
    }
    
    @scala.inline
    implicit class SwitchUnstyledPropsMutableBuilder[Self <: SwitchUnstyledProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: ElementType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setComponents(value: Thumb): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsProps(value: Track): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[SwitchUnstyledProps with RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `switchUnstyledSwitchUnstyledMod.foo` */
  override def _to: ForwardRefExoticComponent[SwitchUnstyledProps with RefAttributes[Any]] = default
}
