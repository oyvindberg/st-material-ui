package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Absolute
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Divider](https://mui.com/material-ui/react-divider/)
    * - [Lists](https://mui.com/material-ui/react-list/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/material-ui/api/divider/)
    */
  @JSImport("@mui/material/Divider/Divider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = js.native
  
  type DividerProps[D /* <: ElementType */, P] = OverrideProps[DividerTypeMap[P, D], D]
  
  trait DividerPropsVariantOverrides extends StObject
  
  trait DividerTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Absolute
  }
  object DividerTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Absolute): DividerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerTypeMap[P, D]]
    }
    
    extension [Self <: DividerTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (DividerTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Absolute): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = default
}
