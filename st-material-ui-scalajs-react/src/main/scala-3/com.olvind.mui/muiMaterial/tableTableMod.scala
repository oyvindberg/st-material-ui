package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableTypeMaptable
import com.olvind.mui.muiMaterial.anon.Padding
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/material-ui/react-table/)
    *
    * API:
    *
    * - [Table API](https://mui.com/material-ui/api/table/)
    */
  @JSImport("@mui/material/Table/Table", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element] = js.native
  
  type TableProps[D /* <: ElementType */, P] = OverrideProps[TableTypeMap[P, D], D]
  
  trait TablePropsSizeOverrides extends StObject
  
  trait TableTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Padding
  }
  object TableTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Padding): TableTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TableTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Padding): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableTypeMaptable, Element] = default
}
