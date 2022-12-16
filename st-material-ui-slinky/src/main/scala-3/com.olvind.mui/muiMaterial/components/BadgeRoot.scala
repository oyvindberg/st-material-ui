package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.StyledComponent.Builder
import slinky.web.html.`*`.tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BadgeRoot {
  
  @JSImport("@mui/material/Badge/Badge", "BadgeRoot")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BadgeRoot.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.Badge | undefined>['root'] */ js.Any, 
    Default[tag.type, js.Object]
  ] = new Builder[
    /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.Badge | undefined>['root'] */ js.Any, 
    Default[tag.type, js.Object]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[tag.type, js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.Badge | undefined>['root'] */ js.Any
  ): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
