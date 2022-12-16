package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableFooterTypeMapt
import com.olvind.mui.muiMaterial.anon.`32`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterTableFooterMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/material-ui/react-table/)
    *
    * API:
    *
    * - [TableFooter API](https://mui.com/material-ui/api/table-footer/)
    */
  @JSImport("@mui/material/TableFooter/TableFooter", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element] = js.native
  
  type TableFooterProps[D /* <: ReactElement */, P] = OverrideProps[TableFooterTypeMap[P, D], D]
  
  trait TableFooterTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & `32`
  }
  object TableFooterTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & `32`): TableFooterTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableFooterTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableFooterTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (TableFooterTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & `32`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableFooterTableFooterMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element] = default
}
