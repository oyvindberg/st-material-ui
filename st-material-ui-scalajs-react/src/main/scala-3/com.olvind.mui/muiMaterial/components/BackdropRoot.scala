package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent.Default
import com.olvind.mui.StyledComponent.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackdropRoot {
  
  @JSImport("@mui/material/Backdrop/Backdrop", "BackdropRoot")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BackdropRoot.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def styled: Builder[
    /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/material.anon.0 | undefined>['root'] */ js.Any, 
    Default[js.Object]
  ] = new Builder[
    /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/material.anon.0 | undefined>['root'] */ js.Any, 
    Default[js.Object]
  ](this.component, new js.Object, js.Array(), (newComponent: Any) => new Default[js.Object](js.Array(newComponent, js.Dictionary.empty)))
  
  def withProps(
    p: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/material.anon.0 | undefined>['root'] */ js.Any
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
