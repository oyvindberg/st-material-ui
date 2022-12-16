package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaginationItemTypeM
import com.olvind.mui.muiMaterial.anon.Page
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemPaginationItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/material-ui/react-pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/material-ui/api/pagination-item/)
    */
  @JSImport("@mui/material/PaginationItem/PaginationItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element] = js.native
  
  type PaginationItemProps[D /* <: ElementType */, P] = OverrideProps[PaginationItemTypeMap[P, D], D]
  
  trait PaginationItemPropsColorOverrides extends StObject
  
  trait PaginationItemPropsSizeOverrides extends StObject
  
  trait PaginationItemPropsVariantOverrides extends StObject
  
  trait PaginationItemTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Page
  }
  object PaginationItemTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Page): PaginationItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationItemTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (PaginationItemTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Page): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `paginationItemPaginationItemMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsPaginationItemTypeM, Element] = default
}
