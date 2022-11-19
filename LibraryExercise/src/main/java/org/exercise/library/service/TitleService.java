/** TODO unificare le service magazine e book
 *
 */



package org.exercise.library.service;

import org.exercise.library.models.Magazine;
import org.exercise.library.models.Title;

import java.util.List;

public interface TitleService {
    Title getTitle(int id);
    List<Title> findTitles();
    Title addTitle(Title newTitle);
    void deleteTitle(int id);
    Title updateTitle(int id, Title updated);
}

