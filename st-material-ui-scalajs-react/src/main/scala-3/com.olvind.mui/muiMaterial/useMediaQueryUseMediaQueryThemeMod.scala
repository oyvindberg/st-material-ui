package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.useMediaQueryUseMediaQueryMod.UseMediaQueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMediaQueryUseMediaQueryThemeMod {
  
  @JSImport("@mui/material/useMediaQuery/useMediaQueryTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme](queryInput: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](queryInput: String, options: UseMediaQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default[Theme](queryInput: js.Function1[/* theme */ Theme, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](queryInput: js.Function1[/* theme */ Theme, String], options: UseMediaQueryOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
