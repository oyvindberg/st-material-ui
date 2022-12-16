package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBreadcrumbsTypeMapn
import com.olvind.mui.muiMaterial.anon.ExpandText
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsBreadcrumbsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
    *
    * API:
    *
    * - [Breadcrumbs API](https://mui.com/material-ui/api/breadcrumbs/)
    */
  @JSImport("@mui/material/Breadcrumbs/Breadcrumbs", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element] = js.native
  
  type BreadcrumbsProps[D /* <: ElementType */, P] = OverrideProps[BreadcrumbsTypeMap[P, D], D]
  
  trait BreadcrumbsTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ExpandText
  }
  object BreadcrumbsTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & ExpandText): BreadcrumbsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (BreadcrumbsTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ExpandText): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbsBreadcrumbsMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBreadcrumbsTypeMapn, Element] = default
}
