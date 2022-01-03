package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BadgeRoot {
  
  @JSImport("@mui/material", "BadgeRoot")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BadgeRoot.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.BadgeRoot | undefined>['root'] */ js.Any
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
