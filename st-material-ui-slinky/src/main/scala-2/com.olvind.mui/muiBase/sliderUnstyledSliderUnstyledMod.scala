package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.DefaultComponentPropsSliderUnstyledTypeM
import com.olvind.mui.muiBase.anon.SliderUnstyledTypeMapspanprops
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderUnstyledSliderUnstyledMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/components/slider/)
    *
    * API:
    *
    * - [SliderUnstyled API](https://mui.com/api/slider-unstyled/)
    */
  @JSImport("@mui/base/SliderUnstyled/SliderUnstyled", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSliderUnstyledTypeM, Element] = js.native
  
  @js.native
  trait ExtendSliderUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with SliderUnstyledTypeMapspanprops = js.native
  }
  object ExtendSliderUnstyledTypeMap {
    
    @scala.inline
    def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with SliderUnstyledTypeMapspanprops
    ): ExtendSliderUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendSliderUnstyledTypeMap[M]]
    }
    
    @scala.inline
    implicit class ExtendSliderUnstyledTypeMapMutableBuilder[Self <: ExtendSliderUnstyledTypeMap[_], M /* <: OverridableTypeMap */] (val x: Self with ExtendSliderUnstyledTypeMap[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with SliderUnstyledTypeMapspanprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mark extends StObject {
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var value: Double = js.native
  }
  object Mark {
    
    @scala.inline
    def apply(value: Double): Mark = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    @scala.inline
    implicit class MarkMutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SliderUnstyledComponentsPropsOverrides extends StObject
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSliderUnstyledTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `sliderUnstyledSliderUnstyledMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSliderUnstyledTypeM, Element] = default
}
