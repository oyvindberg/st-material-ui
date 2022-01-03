package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.badgeUnstyledPropsMod.ExtendBadgeUnstyledTypeMap
import com.olvind.mui.muiMaterial.anon.DefaultComponentD
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Record
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
    * - [Avatars](https://mui.com/components/avatars/)
    * - [Badges](https://mui.com/components/badges/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/api/badge/)
    * - inherits [BadgeUnstyled API](https://mui.com/api/badge-unstyled/)
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
  
  @JSImport("@mui/material/Badge/Badge", "badgeClasses")
  @js.native
  val badgeClasses: BadgeClasses_ = js.native
  
  type BadgeBadgeProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.BadgeRoot | undefined>['badge'] */ js.Any
  
  type BadgeClassKey = /* keyof std.NonNullable<@mui/base.anon.PartialBadgeUnstyledClasses | undefined & @mui/material.anon.AnchorOriginBottomLeftCircular | undefined & @mui/base.anon.PartialBadgeUnstyledClasses | undefined> */ String
  
  type BadgeClasses_ = Record[BadgeClassKey, String]
  
  type BadgeProps[D /* <: ReactElement */, P] = OverrideProps[BadgeTypeMap[D, P], D]
  
  trait BadgePropsColorOverrides extends StObject
  
  trait BadgePropsVariantOverrides extends StObject
  
  type BadgeRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.BadgeRoot | undefined>['root'] */ js.Any
  
  type BadgeTypeMap[D /* <: ReactElement */, P] = ExtendBadgeUnstyledTypeMap[DefaultComponentD[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `badgeBadgeMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = default
}
