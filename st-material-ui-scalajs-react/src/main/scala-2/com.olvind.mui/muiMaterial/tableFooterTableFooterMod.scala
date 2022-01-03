package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableFooterTypeMapt
import com.olvind.mui.muiMaterial.anon.`32`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterTableFooterMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableFooter API](https://mui.com/api/table-footer/)
    */
  @JSImport("@mui/material/TableFooter/TableFooter", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element] = js.native
  
  type TableFooterProps[D /* <: ElementType */, P] = OverrideProps[TableFooterTypeMap[P, D], D]
  
  @js.native
  trait TableFooterTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with `32` = js.native
  }
  object TableFooterTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with `32`): TableFooterTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableFooterTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class TableFooterTypeMapMutableBuilder[Self <: TableFooterTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (TableFooterTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with `32`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableFooterTableFooterMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableFooterTypeMapt, Element] = default
}
