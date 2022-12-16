package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ChildrenClassesSx
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableBodyTypeMaptbo
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
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
  
  type TableBodyProps[D /* <: ElementType */, P] = OverrideProps[TableBodyTypeMap[P, D], D]
  
  trait TableBodyTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ChildrenClassesSx
  }
  object TableBodyTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ChildrenClassesSx): TableBodyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBodyTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableBodyTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TableBodyTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ChildrenClassesSx): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableBodyTableBodyMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableBodyTypeMaptbo, Element] = default
}
