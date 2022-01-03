package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTableHeadTypeMapthe
import com.olvind.mui.muiMaterial.anon.`33`
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  type TableHeadProps[D /* <: ReactElement */, P] = OverrideProps[TableHeadTypeMap[P, D], D]
  
  @js.native
  trait TableHeadTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with `33` = js.native
  }
  object TableHeadTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with `33`): TableHeadTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableHeadTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class TableHeadTypeMapMutableBuilder[Self <: TableHeadTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (TableHeadTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with `33`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tableHeadTableHeadMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTableHeadTypeMapthe, Element] = default
}
