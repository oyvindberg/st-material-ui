package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableContainerTypeM
import com.olvind.mui.muiMaterial.anon.`31`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContainerTableContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Table](https://mui.com/material-ui/react-table/)
    *
    * API:
    *
    * - [TableContainer API](https://mui.com/material-ui/api/table-container/)
    */
  @JSImport("@mui/material/TableContainer/TableContainer", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element] = js.native
  
  type TableContainerProps[D /* <: ElementType */, P] = OverrideProps[TableContainerTypeMap[P, D], D]
  
  trait TableContainerTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & `31`
  }
  object TableContainerTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & `31`): TableContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContainerTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableContainerTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TableContainerTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & `31`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableContainerTableContainerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableContainerTypeM, Element] = default
}
