package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableHeadTypeMapthe
import com.olvind.mui.muiMaterial.anon.`33`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableHeadTableHeadMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableHead API](https://mui.com/api/table-head/)
    */
  @JSImport("@mui/material/TableHead/TableHead", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element] = js.native
  
  type TableHeadProps[D /* <: ElementType */, P] = OverrideProps[TableHeadTypeMap[P, D], D]
  
  trait TableHeadTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & `33`
  }
  object TableHeadTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & `33`): TableHeadTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableHeadTypeMap[P, D]]
    }
    
    extension [Self <: TableHeadTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (TableHeadTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & `33`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadTableHeadMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element] = default
}
