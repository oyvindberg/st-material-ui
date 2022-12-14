package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableBodyTypeMaptbo
import com.olvind.mui.muiMaterial.anon.`30`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyTableBodyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/material-ui/react-table/)
    *
    * API:
    *
    * - [TableBody API](https://mui.com/material-ui/api/table-body/)
    */
  @JSImport("@mui/material/TableBody/TableBody", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = js.native
  
  type TableBodyProps[D /* <: ReactElement */, P] = OverrideProps[TableBodyTypeMap[P, D], D]
  
  trait TableBodyTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & `30`
  }
  object TableBodyTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & `30`): TableBodyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBodyTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableBodyTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (TableBodyTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & `30`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableBodyTableBodyMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = default
}
