package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableRowTypeMaptr
import com.olvind.mui.muiMaterial.anon.Hover
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowTableRowMod extends Shortcut {
  
  /**
    * Will automatically set dynamic row height
    * based on the material table element parent (head, body, etc).
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableRow API](https://mui.com/api/table-row/)
    */
  @JSImport("@mui/material/TableRow/TableRow", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableRowTypeMaptr, Element] = js.native
  
  type TableRowProps[D /* <: ReactElement */, P] = OverrideProps[TableRowTypeMap[P, D], D]
  
  trait TableRowTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Hover
  }
  object TableRowTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Hover): TableRowTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowTypeMap[P, D]]
    }
    
    extension [Self <: TableRowTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (TableRowTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Hover): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableRowTypeMaptr, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableRowTableRowMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableRowTypeMaptr, Element] = default
}
