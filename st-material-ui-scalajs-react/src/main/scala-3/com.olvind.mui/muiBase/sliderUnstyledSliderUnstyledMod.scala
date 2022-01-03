package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.DefaultComponentPropsSliderUnstyledTypeM
import com.olvind.mui.muiBase.anon.SliderUnstyledTypeMapspanprops
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  trait ExtendSliderUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & SliderUnstyledTypeMapspanprops
  }
  object ExtendSliderUnstyledTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & SliderUnstyledTypeMapspanprops
    ): ExtendSliderUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendSliderUnstyledTypeMap[M]]
    }
    
    extension [Self <: ExtendSliderUnstyledTypeMap[?], M /* <: OverridableTypeMap */](x: Self & ExtendSliderUnstyledTypeMap[M]) {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & SliderUnstyledTypeMapspanprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mark extends StObject {
    
    var label: js.UndefOr[Node] = js.undefined
    
    var value: Double
  }
  object Mark {
    
    inline def apply(value: Double): Mark = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    extension [Self <: Mark](x: Self) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SliderUnstyledComponentsPropsOverrides extends StObject
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSliderUnstyledTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `sliderUnstyledSliderUnstyledMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSliderUnstyledTypeM, Element] = default
}
