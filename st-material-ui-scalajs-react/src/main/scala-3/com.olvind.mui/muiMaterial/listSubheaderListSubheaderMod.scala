package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListSubheaderTypeMa
import com.olvind.mui.muiMaterial.anon.DisableSticky
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderListSubheaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/material-ui/react-list/)
    *
    * API:
    *
    * - [ListSubheader API](https://mui.com/material-ui/api/list-subheader/)
    */
  @JSImport("@mui/material/ListSubheader/ListSubheader", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element] = js.native
  
  type ListSubheaderProps[D /* <: ElementType */, P] = OverrideProps[ListSubheaderTypeMap[P, D], D]
  
  trait ListSubheaderTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DisableSticky
  }
  object ListSubheaderTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & DisableSticky): ListSubheaderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSubheaderTypeMap[P, D]]
    }
    
    extension [Self <: ListSubheaderTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ListSubheaderTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableSticky): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element]
  
  /* This means you don't have to write `default`, but can instead just say `listSubheaderListSubheaderMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsListSubheaderTypeMa, Element] = default
}
