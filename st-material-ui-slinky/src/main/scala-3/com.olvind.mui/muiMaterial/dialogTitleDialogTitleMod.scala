package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ChildrenClasses
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDialogTitleTypeMapT
import com.olvind.mui.muiMaterial.anon.OmitTypographyTypeMapspanpropsclasses
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogTitleDialogTitleMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dialog](https://mui.com/material-ui/react-dialog/)
    *
    * API:
    *
    * - [DialogTitle API](https://mui.com/material-ui/api/dialog-title/)
    */
  @JSImport("@mui/material/DialogTitle/DialogTitle", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element] = js.native
  
  type DialogTitleProps[D /* <: ReactElement */, P] = OverrideProps[DialogTitleTypeMap[P, D], D]
  
  trait DialogTitleTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & ChildrenClasses & OmitTypographyTypeMapspanpropsclasses
  }
  object DialogTitleTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & ChildrenClasses & OmitTypographyTypeMapspanpropsclasses): DialogTitleTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogTitleTypeMap[P, D]]
    }
    
    extension [Self <: DialogTitleTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (DialogTitleTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ChildrenClasses & OmitTypographyTypeMapspanpropsclasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element]
  
  /* This means you don't have to write `default`, but can instead just say `dialogTitleDialogTitleMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDialogTitleTypeMapT, Element] = default
}
