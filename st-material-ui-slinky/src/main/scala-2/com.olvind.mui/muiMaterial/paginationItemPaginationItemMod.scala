package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaginationItemTypeM
import com.olvind.mui.muiMaterial.anon.Page
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemPaginationItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/api/pagination-item/)
    */
  @JSImport("@mui/material/PaginationItem/PaginationItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element] = js.native
  
  type PaginationItemProps[D /* <: ReactElement */, P] = OverrideProps[PaginationItemTypeMap[P, D], D]
  
  @js.native
  trait PaginationItemPropsColorOverrides extends StObject
  
  @js.native
  trait PaginationItemPropsSizeOverrides extends StObject
  
  @js.native
  trait PaginationItemPropsVariantOverrides extends StObject
  
  @js.native
  trait PaginationItemTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Page = js.native
  }
  object PaginationItemTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Page): PaginationItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class PaginationItemTypeMapMutableBuilder[Self <: PaginationItemTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (PaginationItemTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Page): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `paginationItemPaginationItemMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element] = default
}
