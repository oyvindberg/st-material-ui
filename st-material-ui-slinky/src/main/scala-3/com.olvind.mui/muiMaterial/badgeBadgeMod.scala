package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.badgeUnstyledBadgeUnstyledDottypesMod.ExtendBadgeUnstyledTypeMap
import com.olvind.mui.muiMaterial.anon.DefaultComponentProps
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeBadgeMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatar](https://mui.com/material-ui/react-avatar/)
    * - [Badge](https://mui.com/material-ui/react-badge/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/material-ui/api/badge/)
    * - inherits [BadgeUnstyled API](https://mui.com/base/api/badge-unstyled/)
    */
  @JSImport("@mui/material/Badge/Badge", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = js.native
  
  @JSImport("@mui/material/Badge/Badge", "BadgeMark")
  @js.native
  val BadgeMark: ReactComponentClass[BadgeBadgeProps] = js.native
  
  @JSImport("@mui/material/Badge/Badge", "BadgeRoot")
  @js.native
  val BadgeRoot: ReactComponentClass[BadgeRootProps] = js.native
  
  type BadgeBadgeProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.Badge | undefined>['badge'] */ js.Any
  
  trait BadgeOrigin extends StObject {
    
    var horizontal: "left" | "right"
    
    var vertical: "top" | "bottom"
  }
  object BadgeOrigin {
    
    inline def apply(horizontal: "left" | "right", vertical: "top" | "bottom"): BadgeOrigin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeOrigin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeOrigin] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: "left" | "right"): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: "top" | "bottom"): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  type BadgeProps[D /* <: ReactElement */, P] = OverrideProps[BadgeTypeMap[D, P], D]
  
  trait BadgePropsColorOverrides extends StObject
  
  trait BadgePropsVariantOverrides extends StObject
  
  type BadgeRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.Badge | undefined>['root'] */ js.Any
  
  type BadgeTypeMap[D /* <: ReactElement */, P] = ExtendBadgeUnstyledTypeMap[DefaultComponentProps[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `badgeBadgeMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = default
}
