package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.OmitPopperUnstyledPropsdivdirectionRefAt
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Autocomplete](https://mui.com/material-ui/react-autocomplete/)
    * - [Menu](https://mui.com/material-ui/react-menu/)
    * - [Popper](https://mui.com/material-ui/react-popper/)
    *
    * API:
    *
    * - [Popper API](https://mui.com/material-ui/api/popper/)
    */
  @JSImport("@mui/material/Popper", JSImport.Default)
  @js.native
  val default: ReactComponentClass[OmitPopperUnstyledPropsdivdirectionRefAt] = js.native
  
  type _To = ReactComponentClass[OmitPopperUnstyledPropsdivdirectionRefAt]
  
  /* This means you don't have to write `default`, but can instead just say `popperMod.foo` */
  override def _to: ReactComponentClass[OmitPopperUnstyledPropsdivdirectionRefAt] = default
}
